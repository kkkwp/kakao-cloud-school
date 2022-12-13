import React from "react";

const MyComponent = (props) => {
    return (<>
        <div>나의 컴포넌트의 이름은 {props.name} 입니다.</div>
        <p>{props.children}</p>
    </>)
};

MyComponent.defaultProps = {
    name: '기본값'
}

export default MyComponent;