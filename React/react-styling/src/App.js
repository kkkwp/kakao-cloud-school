import React from "react";

function App() {
    return (
        <div>
            <button onClick={(e) => {
                fetch('https://jsonplaceholder.typicode.com/users')
                    .then((response) => response.json())
                    .then((data) => console.log(data))
                    .catch((error) => console.log(error.message))
            }}> 다운로드 </button>
        </div>
    );
}

export default App;