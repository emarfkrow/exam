/**
 * 子なしグリッド定義
 */

let Tb1KoDinksGridColumns = [];

$(function() {
    Tb1KoDinksGridColumns = [
        Column.text('OYA_ID', Messages['Tb1KoDinksGrid.oyaId'], 90, 'primaryKey numbering', null),
        Column.text('KO_BN', Messages['Tb1KoDinksGrid.koBn'], 90, 'primaryKey numbering', null),
        Column.text('DINKS_INFO', Messages['Tb1KoDinksGrid.dinksInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb1KoDinksGrid.updateTs'], 207, 'metaInfo optLock', Slick.Formatters.Extends.Timestamp),
    ];
});
