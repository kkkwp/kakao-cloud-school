import React from 'react';

// 하나의 항목을 출력하기 위한 컴포넌트
const ToDoItem = ({ todo, onToggle, onRemove }) => {
    return (
        <div>
            <input type='checkbox' />
            <span>텍스트</span>
            <button>삭제</button>
        </div>
    );
}

// 여러 개의 ToDoItem을 출력할 컴포넌트
const ToDos = ({ input, todos, onChangeInput, onInsert, onToggel, onRemove }) => {
    const onSubmit = (e) => {
        e.preventDefault();
    }

    return (
        <div>
            <form onSubmit={onSubmit}>
                <input />
                <button type="submit">등록</button>
            </form>
            <div>
                <ToDoItem />
                <ToDoItem />
                <ToDoItem />
                <ToDoItem />
                <ToDoItem />
            </div>
        </div>
    )
}

export default ToDos;