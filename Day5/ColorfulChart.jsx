
import PropTypes from 'prop-types';
import classNames from 'classnames';
import Chart from 'react-apexcharts';

const defaultOptions = {
  chart: {
    id: 'sparkline1',
    type: 'line',
    height: 140,
    sparkline: {
      enabled: true
    },
    group: 'sparklines'
  },
  stroke: {
    curve: 'smooth'
  },
  markers: {
    size: 0
  },
  tooltip: {
    cssClass: 'tooltip-custom',
    marker: {
      show: false
    },
    fixed: {
      enabled: true,
      position: 'right'
    },
    x: {
      show: false
    }
  },
  colors: ['#fff']
};

const ColorfulChart = ({ className, title, data, type, options }) => (
  <div className={classNames('colorful-chart', className)}>
    <h3>{title}</h3>
    <Chart
      series={data}
      type={type}
      height={100}
      options={Object.assign({}, defaultOptions, options)}
    />
  </div>
);

ColorfulChart.propTypes = {
  className: PropTypes.string,
  title: PropTypes.string.isRequired,
  data: PropTypes.any.isRequired,
  type: PropTypes.oneOf([
    'line',
    'area',
    'bar',
    'histogram',
    'pie',
    'donut',
    'radialBar',
    'scatter',
    'bubble',
    'heatmap',
    'treemap',
    'boxPlot',
    'candlestick',
    'radar',
    'polarArea',
    'rangeBar'
  ]),
  options: PropTypes.any,
};

export default ColorfulChart;
