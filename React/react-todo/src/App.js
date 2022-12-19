import ToDoTemplate from "./components/ToDoTemplate";
import ToDoInsert from "./components/ToDoInsert";
import ToDoList from "./components/ToDoList";

// useRef는 변수를 생성하거나 변수를 만들어 DOM에 할당하기 위해서
// useCallback은 함수를 효율적으로 생성하기 위해서
import { useState, useRef, useCallback } from 'react';

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

  // 아이디를 위한 변수 생성
  const nextId = useRef(5);

  // 삽입을 처리하기 위한 함수
  // todos에 변화가 생기면 함수를 만들지만, 그렇지 않으면 기존 함수를 이용
  const onInsert = useCallback((text) => {
    const todo = {
      id: nextId.current,
      text,
      checked: false
    }
    setToDos(todos.concat(todo));
    nextId.current += 1;
  }, [todos]);

  //데이터 삭제를 위한 함수
  const onRemove = useCallback((id) => {
    setToDos(todos.filter(todo => todo.id !== id));
  }, [todos])

  // 데이터 수정을 위한 함수
  const onToggle = useCallback((id) => {
    // todos를 복제해서 하나씩 순회하면서 
    // todo의 id 값과 매개변수로 받은 id가 일치하면 checked를 반전하고, 그렇지 않으면 그대로
    setToDos(todos.map(todo => todo.id === id
      ? { ...todo, checked: !todo.checked } : todo))
  }, [todos])

  return (
    <ToDoTemplate>
      <ToDoInsert
        onInsert={onInsert} />
      <ToDoList
        todos={todos}
        onRemove={onRemove}
        onToggle={onToggle} />
    </ToDoTemplate>
  );
}

export default App;