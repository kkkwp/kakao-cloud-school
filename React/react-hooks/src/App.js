import React, { useState, useEffect } from 'react';

const ClassEffect = () => {
  const [count, setCount] = useState(0);

  useEffect(() => {
    console.log("마운트와 업데이트가 끝나면 호출");
    document.title = `You clicked ${count} times`;
  });

  return (
    <div>
      <p>클릭을 {this.state.count}번 수행</p>
      <button onClick={(e) =>
        setCount(count + 1)
      }>+1</button>
    </div>
  );
}

const App = () => {
  return (
    <div>
      <ClassEffect />
    </div>
  )
}

export default App;