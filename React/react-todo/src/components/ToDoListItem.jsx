import React from 'react';

import {
    MdOutlineFavoriteBorder,
    MdOutlineFavorite,
    MdClear
} from 'react-icons/md';

import './ToDoListItem.scss'

const ToDoListItem = () => {
    return (
        <div className="ToDoListItem">
            <div className="checkbox">
                <MdOutlineFavoriteBorder />
                <div className='text'>할 일</div>
            </div>
            <div className="remove">
                <MdClear />
            </div>
        </div>
    )
}

export default ToDoListItem;