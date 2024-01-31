
import { Table, Panel } from 'rsuite';

const { Column, HeaderCell, Cell } = Table;

const eventData = [
  {
    id: 1,
    eventName: 'Party Event 1',
    date: '2022-05-15',
    attendees: '350',
    location: 'Chennai,India'
  },
  {
    id: 2,
    eventName: 'Party Event 2',
    date: '2022-06-20',
    attendees: '150',
    location: 'Bangalore,India'
  },
  {
    id: 3,
    eventName: 'Party Event 3',
    date: '2022-07-10',
    attendees: '200',
    location: 'Coimbatore,India'
  },
  {
    id: 4,
    eventName: 'Party Event 4',
    date: '2022-08-10',
    attendees: '24',
    location: 'Jaipur,India'
  },
  // Add more event data as needed
];

const EventDataTable = () => {
  return (
    <Panel className="card" header="Upcoming Events">
      <Table height={300} data={eventData} rowKey="id">
        <Column flexGrow={1} minWidth={100}>
          <HeaderCell>EVENT NAME</HeaderCell>
          <Cell>
            {rowData => (
              <a href="#" onClick={() => handleEventClick(rowData)}>{rowData.eventName}</a>
            )}
          </Cell>
        </Column>

        <Column width={130}>
          <HeaderCell>DATE</HeaderCell>
          <Cell dataKey="date" />
        </Column>

        <Column width={100}>
          <HeaderCell>ATTENDEES</HeaderCell>
          <Cell dataKey="attendees" />
        </Column>

        <Column flexGrow={1} minWidth={100}>
          <HeaderCell>LOCATION</HeaderCell>
          <Cell dataKey="location" />
        </Column>
      </Table>
    </Panel>
  );
};

const handleEventClick = rowData => {
  // Add logic for handling click on event name
  console.log('Event clicked:', rowData.eventName);
};

export default EventDataTable;
