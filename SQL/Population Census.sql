SELECT SUM(city.population) FROM City
INNER JOIN Country 
ON City.countrycode = Country.code
WHERE continent = 'Asia'
