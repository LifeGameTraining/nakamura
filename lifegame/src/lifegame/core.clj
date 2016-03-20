(ns lifegame.core
  (:gen-class))

(def greet-word "ゲームを始めます！！")

(defrecord GameInfo [field quit-frag])

(def initialized-game-info
  (->GameInfo
    "
    -----------------------******----
    ---------------------------***---
    ---------------------------------
    -----------***-------------------
    "
    false))

(defn print-field [{f :field}]
  (println f))

(defn quit? [{q :quit-frag}]
  q)

(defn update-game-info [game-info]
  game-info)

(defn game-main [game-info]
  (print-field game-info)
  (let [new-game-info (update-game-info game-info)]
    (if (quit? new-game-info)
      (print-field new-game-info)
      (game-main new-game-info))))

(defn greet [word]
  (println word))

(defn play-game []
  (greet greet-word)
  (game-main initialized-game-info))

(defn -main []
  (play-game))