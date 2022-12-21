import MyComponent from "./MyComponent";
import StateComponent from "./StateComponent";
import EventPractice from "./EventPractice";
import ValidationSample from "./ValidationSample";
import ScrollBox from "./ScrollBox";

import React, { Component } from 'react';

class App extends Component {
  render() {
    return (
      <>
        <MyComponent name={'star'} year={2022}>태그 안의 내용</MyComponent>
        <StateComponent />
        <EventPractice />
        <ValidationSample />
        <ScrollBox ref={(ref) => this.scrollbox = ref} />
        <button onClick={(e) => { this.scrollbox.scrollToBottom() }}>맨 아래로</button>
      </>
    );
  }
}

export default App;