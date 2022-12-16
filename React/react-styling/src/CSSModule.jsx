import React from "react";

import styles from './CSSModule.module.css';

const CSSModule = () => {
    return (
        <div className={styles.wrapper}>
            처음 사용해보는 <span className="something">CSS Module</span>
        </div>
    )
}

export default CSSModule;