import matplotlib.pylab as plt

LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

def frequency_analysis(text):
    text = text.upper()

    letter_freqs = {}

    for char in LETTERS:
        letter_freqs[char] = 0

    for char in text:
        if char in LETTERS:
            letter_freqs[char] += 1

    return letter_freqs

def plot_distrubution(freqs):
    plt.bar(freqs.keys(), freqs.values())
    plt.show()

if __name__ == '__main__':
    plain_text = "Sauood is cool boi unlike the other bois in the town"
    freq = frequency_analysis(plain_text)
    plot_distrubution(freq)