/**
 * 転生先明細グリッド定義
 */

let Tb5TenseisakiDetGridColumns = [];

$(function() {
    Tb5TenseisakiDetGridColumns = [
        Column.comma('TENSEISAKI_ID', Messages['Tb5TenseisakiDetGrid.tenseisakiId'], 80, 'primaryKey numbering', null),
        Column.comma('TENSEISAKI_BN', Messages['Tb5TenseisakiDetGrid.tenseisakiBn'], 80, 'primaryKey numbering', null),
        Column.text('TENSEISAKI_DET_INFO', Messages['Tb5TenseisakiDetGrid.tenseisakiDetInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb5TenseisakiDetGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb5TenseisakiDetGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb5TenseisakiDetGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
