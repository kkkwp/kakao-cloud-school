import MyComponent from "./MyComponent";
import StateComponent from "./StateComponent";
import EventPractice from "./EventPractice";
import ValidationSample from "./ValidationSample";

function App() {
  return (
    <>
      <MyComponent name={3}>태그 안의 내용</MyComponent>
      <StateComponent />
      <EventPractice />
      <ValidationSample />
    </>
  );
}

export default App;