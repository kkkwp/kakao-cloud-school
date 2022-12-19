import React from 'react';

import {
    MdOutlineFavoriteBorder,
    MdOutlineFavorite,
    MdClear
} from 'react-icons/md';

import cn from 'classnames';

import './ToDoListItem.scss'

import { useCallback } from 'react';

const ToDoListItem = ({ todo, onRemove, onToggle, style }) => {
    // 넘어온 데이터 중에서 text와 checked만 분해
    const { id, text, checked } = todo;

    // 데이터 삭제 함수
    const onDelete = useCallback((e) => {
        const result = window.confirm(text + "를 정말 삭제하시겠어요? o(TヘTo)");
        if (result) {
            onRemove(id);
        }
    }, [onRemove, id, text]);

    return (
        <div className="ToDoListItem-virtualized" style={style}>
            <div className="ToDoListItem">
                <div className={cn("checkbox", { checked })}
                    onClick={(e) => onToggle(id)}>
                    {checked ? <MdOutlineFavorite /> : <MdOutlineFavoriteBorder />}
                    <div className="text">{text}</div>
                </div>
                <div className="remove" onClick={onDelete}>
                    <MdClear />
                </div>
            </div >
        </div>
    )
}

export default React.memo(ToDoListItem);