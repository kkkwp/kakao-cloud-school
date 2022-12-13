import React, { Component } from 'react';

class EventPractice extends Component {
    state = {
        name: ''
    }

    //babel 이 인스턴스의 메서드로 변환을 자동으로 수행
    //this.handleChange로 이 메서드를 사용하는 것이 가능
    handleChange = (e) => {
        this.setState({
            name: e.target.value
        })
    }

    handleClick = (e) => {
        alert(this.state.name);
        this.setState({
            name: ''
        })
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
                    onChange={this.handleChange} />
                <button onClick={this.handleClick}>확인</button>
            </>
        );
    }
}

export default EventPractice;