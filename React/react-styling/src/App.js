import React from "react";
import axios from 'axios';

function App() {
    return (
        <div>
            <button onClick={(e) => {
                axios.get('https://jsonplaceholder.typicode.com/users')
                    .then(response => console.log(response.data))
                    .catch(error => console.log(error));
            }}> 다운로드 </button>
        </div>
    );
}

export default App;