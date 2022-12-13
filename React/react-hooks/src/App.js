import Iteration from "./Iteration";
import ErrorBoundary from "./ErrorBoundary";

function App() {
  return (
    <div>
      <ErrorBoundary>
        <Iteration />
      </ErrorBoundary>
    </div>
  );
}

export default App;