import React from "react";
import { Auth0Provider } from "@auth0/auth0-react";

const Auth0ProviderWithConfig = ({ children }) => {
  return (
    <Auth0Provider
      domain={process.env.REACT_APP_AUTH0_DOMAIN}
      clientId={process.env.REACT_APP_AUTH0_CLIENT_ID}
      authorizationParams={{
        redirect_uri: process.env.REACT_APP_AUTH0_REDIRECT_URI
      }}
    >
      {children}
    </Auth0Provider>
  );
};

export default Auth0ProviderWithConfig;
