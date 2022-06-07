function fn() {
  var env = karate.env; // get system property 'karate.env'
  var url = 'http://localhost:8093/'
  karate.log('karate.env system property was:', env);

  if (!env) {
    env = 'dev';
  }
  var config = {
    env: env,
    baseUrl: url
  }
//  if (env == 'dev') {
//  } else if (env == 'e2e') {
//  } else {
//  }
  karate.configure('connectTimeout', 5000);
  karate.configure('readTimeout', 5000);
  return config;
}