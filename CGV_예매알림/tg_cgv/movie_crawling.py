import requests
import telegram
from bot_token import bot
from bs4 import BeautifulSoup
from apscheduler.schedulers.blocking import BlockingScheduler

from dev.CGV_예매알림.tg_cgv import bot_token

url = 'http://www.cgv.co.kr/common/showtimes/iframeTheater.aspx?areacode=01&theatercode=0013&date=20220102'

def jobfunction():
    html = requests.get(url)
    soup = BeautifulSoup(html.text, 'html.parser')
    print(bot)
    print(soup)

    imax = soup.select_one('span.imax')

    if(imax):
        imax = imax.find_parent('div',class_ = 'col-times')
        title = imax.select_one('div.info-movie > a > strong').text.strip()
        bot.sendMessage(chat_id = 5000538977, text = title + ' IMAX 예매가 열렸습니다.')
        sched.pause()

sched = BlockingScheduler()
sched.add_job(jobfunction, 'interval', seconds = 15)
sched.start()


