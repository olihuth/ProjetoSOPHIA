
// Gráfico 1
const ctx1 = document.getElementById('graph1').getContext('2d');
new Chart(ctx1, {
   type: 'pie',
   data: {
       labels: ['N1', 'N2'],
       datasets: [{
           data: [225, 27],  // Valores das seções do gráfico
           backgroundColor: ['green', 'yellow'],  // Cores das seções
           borderColor: ['black'],
           borderWidth: 2
       }]
   },
   options: {
      responsive: true,
      plugins: {
          title: {
              display: true,
              text: 'Atendimentos por Complexidade',
              font: {
                  size: 16
              },
              padding: {
                  top: 10,
                  bottom: 20
              }
          },
          tooltip: {
              callbacks: {
                  label: function(context) {
                      let label = context.label || '';
                      if (context.raw !== undefined) {
                          label += ': ' + context.raw + '%';  // Adiciona a porcentagem ao rótulo
                      }
                      return label;
                  }
              }
          },
          legend: {
              display: true
          }
      }
  },
});
//FIM Gráfico 1

//Gráfico 2
const ctx2 = document.getElementById("graph2");
const data2 = {
   labels: ['Contrato', 'Demanda Real'],
   datasets: [
       {
           label: 'Estagiário',
           data: [50, 43],
           backgroundColor: '#999999'
       },
       {
           label: 'Júnior',
           data: [50, 56], 
           backgroundColor: '#99c9ef'
       },
       {
           label: 'Pleno',
           data: [0, 1], 
           backgroundColor: '#3393df'
       }
   ]
};
const options2 = {
   plugins: {
       title: {
           display: true,
           text: 'Contrato x Demanda Real'
       },
       tooltip: {
           callbacks: {
            label: function(context) {
               const dataset = context.dataset;
               const currentValue = dataset.data[context.dataIndex];
               const total = context.chart.data.datasets.reduce((sum, dataset) => sum + dataset.data[context.dataIndex], 0);
               const percentage = ((currentValue / total) * 100).toFixed(1);
               return `${dataset.label}: ${percentage}%`;
               }
           }
       }
   },
   responsive: true,
   scales: {
       x: {
           stacked: true
       },
       y: {
           stacked: true,
           min: 0,
           max: 100,
           ticks: {
               callback: function(value) {
                   return value + '%';  // Exibe o eixo Y em porcentagem
               }
           }
       }
   }
};
new Chart(ctx2, {
   type: 'bar',
   data: data2,
   options: options2
});
//FIM Gráfico 2

//Gráfico 3
const ctx3 = document.getElementById('graph3');
const data3 = {
   labels: ['Ociosidade'],
   datasets: [
       {
           label: 'Estagiário',
           data: [1],
           backgroundColor: '#999999'
       },
       {
           label: 'Júnior',
           data: [3],
           backgroundColor: '#99c9ef'
       },
       {
           label: 'Pleno',
           data: [4],
           backgroundColor: '#3393df'
       },
       {
           label: 'Senior',
           data: [13],
           backgroundColor: '#003c6c'
       },
       {
           label: 'Expert',
           data: [3],
           backgroundColor: '000000'
       }
   ]
};
const options3 = {
   plugins: {
       title: {
           display: true,
           text: 'Ociosidade por Senioridade'
       },
       tooltip: {
           callbacks: {
               label: function(tooltipItem) {
                   return `${tooltipItem.dataset.label}: ${tooltipItem.raw}`;
               }
           }
       },
       datalabels: {
           formatter: (value) => value,  // Exibe o valor inteiro
           color: '#fff',
       }
   },
   responsive: true,
   scales: {
       x: {
           stacked: true
       },
       y: {
           stacked: true,
           ticks: {
               precision: 0,  // Garantir que os números sejam inteiros
           }
       }
   }
};
new Chart(ctx3, {
   type: 'bar',
   data: data3,
   options: options3,
   plugins: [ChartDataLabels]
});
//FIM Gráfico 3

//Gráfico 4
const ctx4 = document.getElementById('graph4').getContext('2d');
const data4 = {
   labels: ['Janeiro', 'Fevereiro', 'Março'],  
   datasets: [
       {
           label: 'N1',
           data: [84,43,98],
           borderColor: 'Green',
           fill: false
       },
       {
           label: 'N2',
           data: [2,16,9],
           borderColor: 'Yellow',
           fill: false
       }
   ]
};

const options4 = {
   plugins: {
       title: {
           display: true,
           text: 'Gráfico de Linha - Janeiro a Março'
       },
       tooltip: {
           callbacks: {
               label: function(tooltipItem) {
                   return `${tooltipItem.dataset.label}: ${tooltipItem.raw}`;
               }
           }
       }
   },
   responsive: true,
   maintainAspectRation: false,
   scales: {
       x: {
           title: {
               display: true,
               text: 'Datas'
           }
       },
       y: {
           title: {
               display: true,
               text: 'Valores'
           },
           ticks: {
               precision: 0
           }
       }
   }
};

new Chart(ctx4, {
   type: 'line',
   data: data4,
   options: options4
});