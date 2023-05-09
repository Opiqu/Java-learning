import  CashHaaa.CashHaha;
public class CashCard {
        public String number;//改成private??
        public int balance;
        public int bonus;

        CashCard(String number, int balance, int bonus) {//建構式封裝了初始流程
            this.number = number;
            this.balance = balance;
            this.bonus = bonus;
        }

        void store(int money) {//封裝儲值流程
            if (money >= 0) {
                this.balance += money;
                if (money >= 1000) {
                    ++this.bonus;
                }
            } else {
                System.out.println("儲值是負的？你是來亂的嗎？");
            }

        }

        void charge(int money) {//封裝領錢流程
            if (money > 0) {
                if (money <= this.balance) {
                    this.balance -= money;
                } else {
                    System.out.println("錢不夠啦！");
                }
            } else {
                System.out.println("扣負數？這不是叫我儲值嗎？");
            }

        }

        int exchange(int bonus) {//...
            if (bonus > 0) {
                this.bonus -= bonus;
            }

            return this.bonus;
        }

        int getBalance() {
            return this.balance;
        }

        int getBonus() {
            return this.bonus;
        }

        String getNumber() {
            return this.number;
        }

    }

