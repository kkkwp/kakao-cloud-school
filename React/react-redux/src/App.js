import Counter from "./components/Counter";
import ToDos from "./components/ToDos";

function App() {
  return (
    <div>
      <Counter number={0} />
      <hr />
      <ToDos />
    </div>
  );
}

export default App;
