/**
 * 転生先明細グリッド定義
 */

let Tb5TenseiSakiDetGridColumns = [];

$(function() {
    Tb5TenseiSakiDetGridColumns = [
        Column.text('TENSEI_SAKI_ID', Messages['Tb5TenseiSakiDetGrid.tenseiSakiId'], 80, 'primaryKey numbering', null),
        Column.text('TENSEI_SAKI_BN', Messages['Tb5TenseiSakiDetGrid.tenseiSakiBn'], 80, 'primaryKey numbering', null),
        Column.text('TENSEI_SAKI_DET_INFO', Messages['Tb5TenseiSakiDetGrid.tenseiSakiDetInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb5TenseiSakiDetGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb5TenseiSakiDetGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb5TenseiSakiDetGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
