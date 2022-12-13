import MyComponent from "./MyComponent";
import StateComponent from "./StateComponent";

function App() {
  return (
    <>
      <MyComponent name={3}>태그 안의 내용</MyComponent>
      <StateComponent />
    </>
  );
}

export default App;