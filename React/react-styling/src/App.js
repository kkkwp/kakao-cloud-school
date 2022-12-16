import CSSModule from "./CSSModule";

import styles from './App.scss';
import classNames from 'classnames/bind';

const cx = classNames.bind(styles);

function App() {
    const isBlue = false;
    return (
        <div >
            <div className={cx('box', { blue: isBlue })}>
                <div className={cx('box-inside')} />
            </div>
            <CSSModule />
        </div>
    );
}

export default App;