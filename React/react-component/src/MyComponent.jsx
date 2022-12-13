import React from "react";

const MyComponent = ({ children, name }) => {
    return (<>
        <div>나의 컴포넌트의 이름은 {name} 입니다.</div>
        <p>{children}</p>
    </>)
};

MyComponent.defaultProps = {
    name: '기본값'
}

export default MyComponent;