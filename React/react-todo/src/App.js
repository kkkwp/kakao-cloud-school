import ToDoTemplate from "./components/ToDoTemplate";
import ToDoInsert from "./components/ToDoInsert";
import ToDoList from "./components/ToDoList";

function App() {
  return (
    <ToDoTemplate>
      <ToDoInsert />
      <ToDoList />
    </ToDoTemplate>
  );
}

export default App;