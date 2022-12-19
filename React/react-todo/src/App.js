import ToDoTemplate from "./components/ToDoTemplate";
import ToDoInsert from "./components/ToDoInsert";
import ToDoList from "./components/ToDoList";

import { useState } from 'react';

function App() {
  const [todos, setToDos] = useState([
    {
      id: 1,
      text: 'HTML, CSS, JavaScript',
      checked: true
    },
    {
      id: 2,
      text: 'Node.js',
      checked: true
    },
    {
      id: 3,
      text: 'MariaDB, MongoDB',
      checked: true
    },
    {
      id: 4,
      text: 'React',
      checked: false
    },
  ]);


  return (
    <ToDoTemplate>
      <ToDoInsert />
      <ToDoList todos={todos} />
    </ToDoTemplate>
  );
}

export default App;