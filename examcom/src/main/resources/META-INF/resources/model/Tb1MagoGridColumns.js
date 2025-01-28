/**
 * 孫グリッド定義
 */

let Tb1MagoGridColumns = [];

$(function() {
    Tb1MagoGridColumns = [
        Column.comma('OYA_ID', Messages['Tb1MagoGrid.oyaId'], 80, 'primaryKey numbering', null),
        Column.comma('KO_BN', Messages['Tb1MagoGrid.koBn'], 80, 'primaryKey numbering', null),
        Column.comma('MAGO_BN', Messages['Tb1MagoGrid.magoBn'], 80, 'primaryKey numbering', null),
        Column.text('MAGO_INFO', Messages['Tb1MagoGrid.magoInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb1MagoGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb1MagoGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb1MagoGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
