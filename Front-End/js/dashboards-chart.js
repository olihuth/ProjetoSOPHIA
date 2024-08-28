var chrt = document.getElementById("graph");
      var graph = new Chart(chrt, {
         type: 'bar',
         data: {
            labels: ["HTML", "CSS", "JAVASCRIPT", "CHART.JS", "JQUERY", "BOOTSTRP"],
            datasets: [{
               label: "online tutorial subjects",
               data: [9, 8, 10, 7, 6, 12],
            }],
         },
         options: {
            responsive: true,
         },
      });

      var chrt = document.getElementById("graph2");
      var graph = new Chart(chrt, {
         type: 'bar',
         data: {
            labels: ["HTML", "CSS", "JAVASCRIPT", "CHART.JS", "JQUERY", "BOOTSTRP"],
            datasets: [{
               label: "online tutorial subjects",
               data: [9, 8, 10, 7, 6, 12],
            }],
         },
         options: {
            responsive: true,
         },
      });