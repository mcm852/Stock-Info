echo -e '.separator "," \n.import src/main/resources/NYSE.csv nyse' | sqlite3 src/main/resources/stocks.db;
echo -e '.separator "," \n.import src/main/resources/NASDAQ.csv nasdaq' | sqlite3 src/main/resources/stocks.db;
echo -e '.separator "," \n.import src/main/resources/AMEX.csv amex' | sqlite3 src/main/resources/stocks.db;
