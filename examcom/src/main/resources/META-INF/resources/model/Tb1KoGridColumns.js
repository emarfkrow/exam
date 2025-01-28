/**
 * 子グリッド定義
 */

let Tb1KoGridColumns = [];

$(function() {
    Tb1KoGridColumns = [
        Column.comma('OYA_ID', Messages['Tb1KoGrid.oyaId'], 80, 'primaryKey numbering', null),
        Column.comma('KO_BN', Messages['Tb1KoGrid.koBn'], 80, 'primaryKey numbering', null),
        Column.text('KO_INFO', Messages['Tb1KoGrid.koInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb1KoGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb1KoGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb1KoGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
