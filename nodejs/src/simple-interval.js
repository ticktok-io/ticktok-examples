const ticktok = require('ticktok');

domain = process.env.TICKTOK_DOMAIN || 'http://localhost:8080';
token = process.env.TICKTOK_TOKEN || 'ticktok-zY3wpR';

ticktok(domain, token)
  .schedule(
    { name: 'simple-interval', schedule: 'every.10.seconds' },
    () => { console.log('tick') }
  );
