var chrt = document.getElementById("graph");
   var graph = new Chart(chrt, {
      type: 'bar',
      data: {
         labels: ["Ex", "Sr", "Pr", "Jr", "Bg"],
         datasets: [{
            label: "online tutorial subjects",
            data: [9, 8, 10, 7, 6, 12],
            backgroundColor: ['yellow', 'aqua', 'pink', 'lightgreen', 'lightblue'],
            borderColor: ['red', 'blue', 'fuchsia', 'green', 'navy'],
            borderWidth: 2,
         }],
      },
      options: {
         responsive: true,
         plugins: {
            legend: {
               display: false
            },
            title: {
               display: true,
               text: 'Consultores disponíveis (por Senioridade)'
            }
         }
      },
});
      
var arraydata = [1, 2, 3];      
var chrt = document.getElementById("graph2");
var graph = new Chart(chrt, {
   type: 'bar',
   data: {
      labels: ["N1", "N2", "N3"],
      datasets: [{
         label: "online tutorial subjects",
         data: arraydata,
         backgroundColor: ['yellow', 'aqua', 'pink'],
         borderColor: ['red', 'blue', 'fuchsia'],
         borderWidth: 2,
      }],
   },
   options: {
      responsive: true,
      plugins: {
         legend: {
            display: false
         },
         title: {
            display: true,
            text: 'Consultores disponíveis (por Complexidade)'
         }
         }
   },
});

var chrt = document.getElementById("graph3");
var graph = new Chart(chrt, {
   type: 'bar',
   data: {
      labels: ["HTML", "CSS", "JAVASCRIPT", "CHART.JS", "JQUERY", "BOOTSTRP"],
      datasets: [{
         label: "online tutorial subjects",
         data: [9, 8, 10, 7, 6, 12],
         backgroundColor: ['yellow', 'aqua', 'pink', 'lightgreen', 'lightblue', 'gold'],
         borderColor: ['red', 'blue', 'fuchsia', 'green', 'navy', 'black'],
         borderWidth: 0,
      }],
   },
   options: {
      responsive: true,
      plugins: {
         legend: {
            display: false
         },
         title: {
            display: true,
            text: 'Custom Chart Title'
         }
         }
   },
});

var chrt = document.getElementById("graph4");
var graph = new Chart(chrt, {
   type: 'bar',
   data: {
      labels: ["HTML", "CSS", "JAVASCRIPT", "CHART.JS", "JQUERY", "BOOTSTRP"],
      datasets: [{
         label: "online tutorial subjects",
         data: [9, 8, 10, 7, 6, 12],
         backgroundColor: ['yellow', 'aqua', 'pink', 'lightgreen', 'lightblue', 'gold'],
         borderColor: ['red', 'blue', 'fuchsia', 'green', 'navy', 'black'],
         borderWidth: 0,
      }],
   },
   options: {
      responsive: true,
      plugins: {
         legend: {
            display: false
         },
         title: {
            display: true,
            text: 'Custom Chart Title'
         }
         }
   },
});

var chrt = document.getElementById("graph5");
var graph = new Chart(chrt, {
   type: 'bar',
   data: {
      labels: ["HTML", "CSS", "JAVASCRIPT", "CHART.JS", "JQUERY", "BOOTSTRP"],
      datasets: [{
         label: "online tutorial subjects",
         data: [9, 8, 10, 7, 6, 12],
         backgroundColor: ['yellow', 'aqua', 'pink', 'lightgreen', 'lightblue', 'gold'],
         borderColor: ['red', 'blue', 'fuchsia', 'green', 'navy', 'black'],
         borderWidth: 0,
      }],
   },
   options: {
      responsive: true,
      plugins: {
         legend: {
            display: false
         },
         title: {
            display: true,
            text: 'Custom Chart Title'
         }
         }
   },
});

var chrt = document.getElementById("graph6");
var graph = new Chart(chrt, {
   type: 'bar',
   data: {
      labels: ["HTML", "CSS", "JAVASCRIPT", "CHART.JS", "JQUERY", "BOOTSTRP"],
      datasets: [{
         label: "online tutorial subjects",
         data: [9, 8, 10, 7, 6, 12],
         backgroundColor: ['yellow', 'aqua', 'pink', 'lightgreen', 'lightblue', 'gold'],
         borderColor: ['red', 'blue', 'fuchsia', 'green', 'navy', 'black'],
         borderWidth: 0,
      }],
   },
   options: {
      responsive: true,
      plugins: {
         legend: {
            display: false
         },
         title: {
            display: true,
            text: 'Custom Chart Title'
         }
         }
   },
});