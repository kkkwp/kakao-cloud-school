import React from "react";

import PropTypes from 'prop-types';

const MyComponent = ({ children, name, year }) => {
    return (<>
        <div>나의 컴포넌트의 이름은 {name} 입니다.</div>
        <p>{children}</p>
        <p>나는 {year}년에 태어났습니다.</p>
    </>)
};

MyComponent.propTypes = {
    name: PropTypes.string,
    year: PropTypes.number.isRequired
}

MyComponent.defaultProps = {
    name: '기본값'
}

export default MyComponent;