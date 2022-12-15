import React, { Component, useState } from 'react';

// 클래스 컴포넌트
class ClassState extends Component {
  /*
  // 생성자를 만들지 않고 이렇게 state를 초기화해도 된다.
  state = {
    count:0
  }
  */

  constructor(props) {
    super(props);
    this.state = { count: 0 };
  }

  render() {
    return (
      <div>
        <p>클릭을 {this.state.count}번 수행</p>
        <button onClick={(e) =>
          this.setState({ count: this.state.count + 1 })
        }>+1</button>
      </div>
    );
  }
}

// 함수형 컴포넌트에서 state 사용
// 함수형 컴포넌트는 인스턴스가 아니므로 this 사용 불가
const FunctionState = () => {
  const [count, setCount] = useState(0);

  return (
    <div>
      <p>클릭을 {count}번 수행</p>
      <button onClick={(e) => setCount(count + 1)}>+1</button>
    </div>
  )
}

function App() {
  return (
    <div>
      <ClassState />
      <FunctionState />
    </div>
  );
}

export default App;