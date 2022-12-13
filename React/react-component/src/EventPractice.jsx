import React, { Component } from 'react';

class EventPractice extends Component {
    state = {
        name: ''
    }

    handleChange(e) {
        this.setState({
            name: e.target.value
        })
    }

    handleClick(e) {
        alert(this.state.name);
        this.setState({
            name: ''
        })
    }

    constructor(props) {
        super(props);
        this.handleChange = this.handleChange.bind(this);
        this.handleClick = this.handleClick.bind(this);
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