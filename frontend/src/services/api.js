// src/services/api.js
import axios from "axios";
import { useAuth0 } from "@auth0/auth0-react";

export const useApi = () => {
  const { getAccessTokenSilently } = useAuth0();

  const apiCall = async (endpoint) => {
    const token = await getAccessTokenSilently();
    return axios.get(endpoint, {
      headers: { Authorization: `Bearer ${token}` },
    });
  };

  return { apiCall };
};
