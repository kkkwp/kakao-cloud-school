import React from "react";

const Iteration = () => {
    const names = ['JavaScript', 'Java', 'Python', 'C#', 'Go', 'Rust'];
    // 배열을 순회하면서 <li>태그로 감싸기 
    const namesList = names.map((name, index) =>
        <li key={index}>{name}</li>
    );

    return (<ul>{namesList}</ul>);
}

export default Iteration;