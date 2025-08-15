// src/pages/Weather.jsx
import React, { useEffect, useState } from "react";
import { useAuth0 } from "@auth0/auth0-react";
import { useApi } from "../services/api";

const Weather = () => {
  const { isAuthenticated } = useAuth0();
  const { apiCall } = useApi();
  const [weather, setWeather] = useState(null);

  useEffect(() => {
    if (isAuthenticated) {
      apiCall("/api/weather")
        .then((res) => setWeather(res.data))
        .catch((err) => console.error(err));
    }
  }, [isAuthenticated]);

  if (!isAuthenticated) return <p>Please log in to see the weather.</p>;

  return (
    <div>
      <h1>Weather Page</h1>
      {weather ? <pre>{JSON.stringify(weather, null, 2)}</pre> : <p>Loading...</p>}
    </div>
  );
};

export default Weather;
