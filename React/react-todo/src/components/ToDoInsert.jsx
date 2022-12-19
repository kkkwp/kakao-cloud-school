import React from "react";

// react-icons의 MaterialDesign의 MdAdd라는 아이콘 사용
import { MdAdd } from 'react-icons/md';

import './ToDoInsert.scss'

const ToDoInsert = () => {
    return (
        <form className="ToDoInsert">
            <input placeholder="할 일을 입력하세요" />
            <button type="submit"><MdAdd /></button>
        </form>
    )
}

export default ToDoInsert;  