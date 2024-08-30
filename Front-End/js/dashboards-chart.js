
// grafico-pizza
const ctx1 = document.getElementById('grafico-pizza').getContext('2d');
const data1 = {
    labels: ['N1', 'N2'],
    datasets: [{
        data: [225, 27],  // Valores das seções do gráfico
        backgroundColor: ['green', 'yellow'],  // Cores das seções
        borderColor: ['black'],
        borderWidth: 2
    }]
}
const options1 = {
    responsive: true,
    //aspectRatio:1,
    maintainAspectRation: false,
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
}
new Chart(ctx1, {
   type: 'pie',
   data: data1,
   options: options1,
});
//FIM grafico-pizza

//grafico-contrato-demanda
const ctx2 = document.getElementById("grafico-contrato-demanda");
const data2 = {
   labels: ['Contrato', 'Demanda Real'],
   datasets: [
       {
           label: 'Estagiário',
           data: [50, 43],
           backgroundColor: '#999999',
           barThickness: 50
       },
       {
           label: 'Júnior',
           data: [50, 56], 
           backgroundColor: '#99c9ef',
           barThickness: 50
       },
       {
           label: 'Pleno',
           data: [0, 1], 
           backgroundColor: '#3393df',
           barThickness: 50
       },
       
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
   //aspectRatio: 2,
   maintainAspectRation: false,
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
//FIM grafico-contrato-demanda

//grafico-ociosidade
const ctx3 = document.getElementById('grafico-ociosidade');
const data3 = {
   labels: ['Ociosidade'],
   datasets: [
       {
           label: 'Estagiário',
           data: [1],
           barThickness: 70,
           backgroundColor: '#999999'
           
       },
       {
           label: 'Júnior',
           data: [3],
           barThickness: 70,
           backgroundColor: '#99c9ef'
       },
       {
           label: 'Pleno',
           data: [4],
           barThickness: 70,
           backgroundColor: '#3393df'
       },
       {
           label: 'Senior',
           data: [13],
           barThickness: 70,
           backgroundColor: '#003c6c'
       },
       {
           label: 'Expert',
           data: [3],
           barThickness: 70,
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
   //aspectRatio: 2,
   maintainAspectRation: false,
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
//FIM grafico-ociosidade

//grafico-linha-atendimentos
const ctx4 = document.getElementById('grafico-linha-atendimentos').getContext('2d');
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
           text: 'Atendimentos por Senioridade'
       },
       tooltip: {
           callbacks: {
               label: function(tooltipItem) {
                   return `${tooltipItem.dataset.label}: ${tooltipItem.raw}`;
               }
           }
       }
   },
   //responsive: true,
   //aspectRatio: 2,
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
//grafico-linha-atendimentos

