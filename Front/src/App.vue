<template>

    <div class="app">
      <Index />
    
      <div id="app" class="app-container">
      <router-view />
    </div>
</div>
  </template>
  
  <script setup>
  import Index from './components/Index.vue'
  </script>
  

  
  <style scoped>
  .app{
      display: flex;
      flex-direction: column;
      align-items: center;
      justify-content: center;
      font-family: 'Courier New', Courier, monospace;
      margin:auto;
  }
  .app-container {

    overflow: hidden;
    background-color: black;
    color: limegreen;
    font-family: 'Courier New', Courier, monospace;
    background-color: #000;
    color: #00ff00;
    border-radius : 20px;
    place-items: top;
  }
  /* Main container with padding to avoid content hiding behind the fixed header */
  
  </style>
  