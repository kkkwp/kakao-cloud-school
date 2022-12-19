import React from 'react';

import {
    MdOutlineFavoriteBorder,
    MdOutlineFavorite,
    MdClear
} from 'react-icons/md';

import cn from 'classnames';

import './ToDoListItem.scss'

const ToDoListItem = ({ todo }) => {
    // 넘어온 데이터 중에서 text와 checked만 분해
    const { id, text, checked } = todo;

    return (
        <div className="ToDoListItem">
            <div className={cn("checkbox", { checked })}>
                {checked ? <MdOutlineFavorite /> : <MdOutlineFavoriteBorder />}
                <div className="text">{text}</div>
            </div>
            <div className="remove">
                <MdClear />
            </div>
        </div>
    )
}

export default ToDoListItem;