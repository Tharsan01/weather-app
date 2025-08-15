import React from "react";
import { useAuth0 } from "@auth0/auth0-react";

function App() {
  const { loginWithRedirect, logout, isAuthenticated, user } = useAuth0();

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <h1>Weather App</h1>

      {!isAuthenticated && <button onClick={() => loginWithRedirect()}>Log In</button>}
      {isAuthenticated && (
        <>
          <button onClick={() => logout({ returnTo: window.location.origin })}>Log Out</button>
          <h2>Welcome, {user.name}</h2>
          <p>Email: {user.email}</p>
        </>
      )}
    </div>
  );
}

export default App;
