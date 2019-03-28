const { ticktok, clock } = require('ticktok');

domain = process.env.TICKTOK_DOMAIN || 'http://localhost:8080';
token = process.env.TICKTOK_TOKEN || 'ticktok-zY3wpR';

ticktok(domain, token)
  .schedule(clock.named('simple-interval').on('every.10.seconds').invoke(() => console.log('tick')));



