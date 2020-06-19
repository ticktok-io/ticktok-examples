const ticktok = require('ticktok');

const domain = process.env.TICKTOK_DOMAIN || 'http://localhost:9643';
const token = process.env.TICKTOK_TOKEN || 'ticktok-zY3wpR';

ticktok(domain, token)
  .schedule(
    { name: 'simple-interval', schedule: 'every.10.seconds' },
    (err, tick) => { console.log('tick') }
  );
