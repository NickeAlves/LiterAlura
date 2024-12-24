import React, { useState } from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import SearchScreen from './ui/screen/searchScreen';
import Header from './ui/components/header';
import Footer from './ui/components/footer';
import "./tailwind.css"; // Adjust the path as needed


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <div className="w-screen content-center items-center justify-center h-auto">
    <Header />
    <SearchScreen />
    <Footer />
  </div>
);