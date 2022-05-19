import React from 'react';
import { createRoot } from 'react-dom/client';
import './assets/styles/index.scss';
import App from './App';

const root = createRoot(document.querySelector('#root') as Element);
root.render(<App />);
