import { createApp } from 'vue';
import App from './App.vue';
import axios from 'axios';
import 'bootstrap/dist/css/bootstrap.css';
import "./assets/style.css";
import { createRouter, createWebHistory } from 'vue-router';


axios.defaults.baseURL = process.env.VUE_APP_API_URL

const router = createRouter({ 
    history: createWebHistory(),
    routes: [
      
    ],
  });

createApp(App).use(router).mount('#app');
