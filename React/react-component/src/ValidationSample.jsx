import React, { Component } from 'react';

import './ValidationSample.css';

class ValidationSample extends Component {
    state = {
        password: '',
        clicked: false,
        validated: false
    };

    handleButtonClick = (e) => {
        this.setState({
            clicked: true,
            validated: this.state.password === '0000'
        })
    }

    handleChange = (e) => {
        this.setState({
            [e.target.name]: e.target.value
        })
    }

    render() {
        return (
            <div>
                <input
                    type='password'
                    value={this.state.password}
                    name='password'
                    onChange={this.handleChange}
                    className={
                        this.state.clicked
                            ? this.state.validated ? 'success' : 'failure'
                            : ''} />
                <button onClick={this.handleButtonClick}>검증하기</button>
            </div>
        )
    }
}

export default ValidationSample;