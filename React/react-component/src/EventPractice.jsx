import React, { Component } from 'react';

class EventPractice extends Component {
    state = {
        name: ''
    }

    render() {
        return (
            <>
                <h1>이벤트 연습</h1>
                <input
                    type='text'
                    name='message'
                    placeholder='이름을 입력하세요'
                    value={this.state.name}
                    onChange={(e) => {
                        this.setState({ name: e.target.value })
                    }} />
                <button onClick={(e) => {
                    alert(this.state.name);
                    this.setState({ name: '' })
                }}>확인</button>
            </>
        );
    }
}

export default EventPractice;